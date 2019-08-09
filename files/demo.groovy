pipelineJob('Demo') {

  displayName('Demo')

  definition {
       cpsScm {
            scm {
                git('https://github.com/RefaelEX/dsl-demo.git')
                scriptPath('demo.Jenkinsfile')
            }
        }
  }

  parameters {
    booleanParam('force', false, 'Recreate the branches even if they already exists. WARNING: this will override existing branches.')
    stringParam('sourceBranch', 'develop', 'What branch to create the new branch from? (e.g. develop)')
    stringParam('targetBranch', '', 'Name of the new branch (e.g. release/154.17)')
  }

}