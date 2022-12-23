pipeline {
    //runs on agent1
    agent { node { label 'agent1' } }
    stages {
      stage('build') {
            agent {
                docker { image 'maven:3.8.6-eclipse-temurin-11' }
            }
            steps {
                sh 'mvn --version'
        }
    }
}
