def call(String filePath) {
    sh """
        sed -i "s/\\(Build v[0-9]*\\.[0-9]*\\.\\)[0-9]*/\\1${env.BUILD_NUMBER}/" ${filePath}
    """
}
