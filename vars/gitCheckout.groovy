def mvnHome = tool 'M3' 

def call(script) {
 git 'https://github.com/sandeepds/spring-petclinic.git'
 // Get the Maven tool.           
 mvnHome = tool 'M3'
} 
