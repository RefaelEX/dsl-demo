node {
	stage('Checkout') {
      checkout scm
    }

    stage('JobDSL') {
      jobDsl targets: [
          'Jobs/demo2.groovy'
          ].join('\n'),
		  
        removedJobAction: 'DISABLE',
        removedViewAction: 'DELETE'
    }  
}
