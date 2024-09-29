call(String imagename, String IMAGE_TAG){
   sh "docker build . -t "${imagename}":"${IMAGE_TAG}""
}
