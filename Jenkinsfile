pipeline {
    //runs on agent1
    agent { node { label 'agent1' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B package --file pom.xml'
            }
        }
 
    }
}
