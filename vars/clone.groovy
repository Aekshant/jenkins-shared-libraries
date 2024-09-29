def codeClone(String url, String branch, String CredId){
  git branch: "${url}", url: "${branch}", credentialsId: "${CredId}"
  echo 'happily Clone'
}
