
def call(String channelName, String environment, String message) {
    // Implement your notification logic here, e.g., using Jenkins Slack plugin
    slackSend(channel: "#${channelName}", message: message)
}