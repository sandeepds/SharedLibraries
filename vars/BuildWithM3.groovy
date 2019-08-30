def mvnHome = tool 'M3'
def call(script, mavenVar) {
    script.withMaven (
        maven: mavenVar) {
                sh 'mvn clean install'
    }
    
    // Run the maven build
    //withEnv(["MVN_HOME=$mvnHome"]) {
       //if (isUnix()) {
          //sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
       //} else {
          //bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
       //}
    //}
}
