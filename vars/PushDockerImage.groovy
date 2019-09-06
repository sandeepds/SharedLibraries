def call(script) {
  sh "sudo docker build -t sandeepds2002/petclinic_${BUILD_NUMBER} ."
  sh "sudo docker push sandeepds2002/petclinic"
}
