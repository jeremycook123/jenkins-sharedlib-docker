def buildImage(String imageName, String tag) {
    sh "docker build -t ${imageName}:${tag} ."
}

def runContainer(String containerName, String imageName, String tag) {
    sh """
        docker stop ${containerName} || true
        docker rm ${containerName} || true
        docker run -d --name ${containerName} -p 8888:80 ${imageName}:${tag}
    """
}
