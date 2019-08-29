def call(script, jdkVar, mavenVar) {
    // Run the maven build
    withEnv(["MVN_HOME=$mvnHome"]) {
       if (isUnix()) {
          sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean package'
       } else {
          bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
       }
    }
}
