pipeline {
    agent any

    environment {
        playbookPath = '/ansible/playbook.yml'
        channelName = 'opstree'
    }

    stages {
        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(playbook: ./ansible)
                }
            }
        }
        stage('Send Slack Notification') {
            steps {
                script {
                    sendSlackNotification(channelName, "Ansible playbook execution completed successfully!")
                }
            }
        }
    }

    post {
        always {
            // Cleanup or post-build actions if needed
        }
    }
}

def sendSlackNotification(channelName, message) {
    slackSend(channel: "#${channelName}", message: message)
}
