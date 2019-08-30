def call(script){
  //def user = "devopsinfra"
  //def pass = "Husslefree12&#36;1"
  //sh {WORKSPACE}
  sh "ansible-playbook ${WORKSPACE}/spring-playbook.yaml -i ${WORKSPACE}/inventory -vvvv "
}
