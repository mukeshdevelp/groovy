@Library('groovy@main') _

pipeline {
    agent any

    stages {
        stage('Greet with Function') {
            steps {
                sayHello('Pipeline User')
            }
        }
        stage('Greet with Class') {
            steps {
                script {
                    def greeter = new org.mukesh.JenkinsHello(this)
                    greeter.sayHelloJenkins()
                }
            }
        }
    }
}
