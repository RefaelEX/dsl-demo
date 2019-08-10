def folderName = 'example';
def jobName = 'demo';

folder(folderName)

pipelineJob("${folderName}/${jobName}") {
		
		definition {
			cps {
				script(readFileFromWorkspace('Jenkinsfile/demo.Jenkinsfile'))
				sandbox()
			}
		}
		
		 parameters {
			booleanParam('force', false, 'Recreate the branches even if they already exists. WARNING: this will override existing branches.')
			stringParam('sourceBranch', 'develop', 'What branch to create the new branch from? (e.g. develop)')
			stringParam('targetBranch', '', 'Name of the new branch (e.g. release/154.17)')
	}
}