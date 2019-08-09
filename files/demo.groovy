pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('files/demo.Jenkinsfile'))
            sandbox()
        }
    }
}
