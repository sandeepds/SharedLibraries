def call(script) {
  
    //Run the sonar scan
    withSonarQubeEnv('sonarqube'){
            sh 'mvn clean package sonar:sonar'
    }
    //Wait for response
    timeout(time: 1, unit: 'MINUTES') {
    def qg = waitForQualityGate()
      if (qg.status != 'OK') {
            currentBuild.status='FAILURE'
            error "Pipeline aborted due to quality gate failure: ${qg.status}"
       }
   }
}
