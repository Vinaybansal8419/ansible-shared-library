
def call(String repoUrl, String destination) {
    repoUrl = https://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@github.com/Vinaybansal8419/ansible-shared-library.git 
    destination = ./home/vagrant/ansible-shared-library
    sh "git clone ${repoUrl} ${destination}"
}