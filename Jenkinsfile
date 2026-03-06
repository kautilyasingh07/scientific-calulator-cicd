pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "kautilyasingh/calculator-app"
        IMAGE_TAG = "${BUILD_NUMBER}-${GIT_COMMIT.take(7)}"
    }

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("${DOCKER_IMAGE}:${IMAGE_TAG}")
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'dockerhub-credentials') {
                        dockerImage.push()
                        dockerImage.push('latest')
                    }
                }
            }
        }
}

    post {
        success {
            // echo "Pipline Completed Successfully"
            emailext(
                subject: "SUCCESS: ${env.JOB_NAME} BUILD #${env.BUILD_NUMBER}",
                body:"""
                    Build completed successfully.
                    Job: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}
                    Build URL: ${env.BUILD_URL}
                    """,
                    to: "kautilyasingh07@gmail.com"
            )
        }
        failure {
            // echo "Pipline failed"
            emailext(
                subject: "FAILED: ${env.JOB_NAME} BUILD #${env.BUILD_NUMBER}",
                body:"""
                    Build failed.
                    Job: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}
                    Check logs: ${env.BUILD_URL}
                    """,
                    to: "kautilyasingh07@gmail.com"
            )
        }
        always {
            cleanWs()
        }
    }

}