def call(script) {
  stage('Sonarqube-scan'){
        //Run the sonar scan
        withSonarQubeEnv('sonarqube'){
                sh 'mvn clean package sonar:sonar'
        }
   }

   stage('Quality-Gate') {
        timeout(time: 1, unit: 'MINUTES') {
        def qg = waitForQualityGate()
          if (qg.status != 'OK') {
                currentBuild.status='FAILURE'
                error "Pipeline aborted due to quality gate failure: ${qg.status}"
           }
        }
   }
}
