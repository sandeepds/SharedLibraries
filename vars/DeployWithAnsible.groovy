def call(script){
  def user = "devopsinfra"
  def pass = "Applestore12\$6"
  sh "ansible-playbook DeployDocker.yml  -vvvv --extra-vars 'HOST=${host}'"
}