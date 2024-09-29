def call(String imagename, String tag) {
    echo "Building Docker image: ${imagename}:${tag}"
    sh "docker build . -t ${imagename}:${tag}"
}
