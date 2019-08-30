def call(script){
  //def user = "devopsinfra"
  //def pass = "Applestore12\$6"
  sh "ansible-playbook /var/lib/jenkins/workspace/Devops_Piepline/spring-playbook.yaml.yml -i inventory -vvvv "
}
