node {
	stage('Checkout') {
      checkout scm
    }

    stage('JobDSL') {
      jobDsl targets: [
          'Jobs/demo.groovy'
          ].join('\n'),
		  
        removedJobAction: 'DISABLE',
        removedViewAction: 'DELETE'
    }  
}
