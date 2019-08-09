node {
	stage('Checkout') {
      checkout scm
    }

    stage('JobDSL') {
      jobDsl targets: [
          'demo.groovy'
          ].join('\n'),
		  
        removedJobAction: 'DISABLE',
        removedViewAction: 'DELETE'
    }  
}
