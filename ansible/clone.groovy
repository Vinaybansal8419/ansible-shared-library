groovy
def call(String repoUrl, String destination) {
    repoUrl = https://github.com/Vinaybansal8419/nginx.git
    destination = ./ansible
    sh "git clone ${repoUrl} ${destination}"
}