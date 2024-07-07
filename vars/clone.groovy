
def call(String repoUrl, String destination) {
    repoUrl = https://github.com/Vinaybansal8419/nginx.git
    destination = ./home/vagrant/ansible-shared-library
    sh "git clone ${repoUrl} ${destination}"
}