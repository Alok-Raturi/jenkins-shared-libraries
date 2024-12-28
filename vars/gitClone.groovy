def call(String repoUrl, String branchName){
    echo "This is cloning the code"
    git url:repoUrl, branch:branchName
    echo "Code cloning successful"
}
