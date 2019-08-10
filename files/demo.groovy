folder('demo folder'){

	pipelineJob('example') {
		
		displayName('Demo')
		
		definition {
			cps {
				script(readFileFromWorkspace('files/demo.Jenkinsfile'))
				sandbox(true)
			}
		}
		
		 parameters {
			booleanParam('force', false, 'Recreate the branches even if they already exists. WARNING: this will override existing branches.')
			stringParam('sourceBranch', 'develop', 'What branch to create the new branch from? (e.g. develop)')
			stringParam('targetBranch', '', 'Name of the new branch (e.g. release/154.17)')
	  }
	}
}