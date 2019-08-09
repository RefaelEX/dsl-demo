node {
	stage('Checkout') {
      checkout scm
    }

    stage('JobDSL') {
      jobDsl targets: [
          'files/demo.groovy'
          ].join('\n'),
		  
        removedJobAction: 'DISABLE',
        removedViewAction: 'DELETE'
    }  
}
