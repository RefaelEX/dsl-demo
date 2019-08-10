node {
	
	stage('Checkout') {
      checkout scm
    }

    stage('JobDSL') {
      jobDsl targets: [
	  'files/Jobs/*.groovy'
	  ].join('\n'),
		  
        removedJobAction: 'DISABLE',
        removedViewAction: 'DELETE'
    }  
}
