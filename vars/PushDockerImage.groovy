def call(script) {
  sh "sudo docker build -t sandeepds2002/petclinic ."
  sh "sudo docker push sandeepds2002/petclinic"
}
