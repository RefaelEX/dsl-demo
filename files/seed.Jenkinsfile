node {
  try {

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
  
  catch (ex) {
    emailext to: 'princeex87@gmail.com.com', body: "<p>Build: ${env.BUILD_URL}<p>", subject: 'seed job failed'
    throw ex
  }
}
