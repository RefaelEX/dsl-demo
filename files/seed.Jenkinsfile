node('master') {
 
  try {

    stage('JobDSL') {
      
	  jobDsl targets: [
          'demo.groovy'
          ].join('\n'),
		  
        removedJobAction: 'DISABLE',
        removedViewAction: 'DELETE',
        lookupStrategy: 'SEED_JOB'
    }
}