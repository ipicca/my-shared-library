@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('TEST') {
            steps {
                bat "123"
            }
        }
    }
    post {
        always {
            echo 'Finalizado.'
        }
        success {
            echo 'Exitoso.'
        }  
        failure {

            echo "testing mails"
            sendEmails(env.CLIENTE, env.JOB_NAME, env.BUILD_NUMBER, env.MAILS)

            echo 'Fallo.'
        }
        unstable {
            echo 'Inestable!'
        }
        changed {
            echo 'El estado ha cambiado.'
        }
    }
}
