pipeline {
    agent any

    stages {
        stage('Build Stage') {
            steps {
                bat 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
    }
}
