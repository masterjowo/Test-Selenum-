pipeline {
    //agent any  // Menjalankan pipeline pada agen manapun yang tersedia atau node atau vm 
    // Gunakan agent berdasarkan label yang sesuai di Jenkins node configuration
    agent { label 'tencent_cloud_vps2_agent1' }
    environment {
        // Definisikan variabel lingkungan jika diperlukan
        // Misalnya untuk kredensial, server, dll.
        DEPLOY_SERVER = 'your.deploy.server'
        BRANCH_NAME = 'main'
    }

        stages {

        stage('Build') {
            steps {
                sh 'pwd'
                sh'docker compose down'
                // sh'docker rmi hasil_test_web_saucedemo_comv2'
                // sh 'mvn clean install'
            }
        }

        stage('Test - Chrome') {
            steps {
                // sh 'mvn test -PTestng -Dbrowser=chrome -Dheadless=true'
                echo 'test'
            }
        }
        stage('Continuous_Build') {
            steps {
                sh'docker compose build'

            }
        }
        stage('Continuous_Deploy_report_html') {
            steps {
                sh'docker compose up -d'
            }
        }

        stage('Cleanup') {
            steps {
                // sh 'mvn clean'
                echo 'test'
            }
        }
    }

    post {
        success {
            // Kirim notifikasi ke Discord setelah build
            discordSend description: "Jenkins Pipeline Build", 
                        footer: "Pipeline berhasil! Proyek telah dibangun, diuji, dan dideploy.", 
                        // link: env.BUILD_URL, 
                        result: currentBuild.currentResult, // or   result: "#3498db",
                        thumbnail: "https://example.com/thumbnail.png",
                        webhookURL: "https://discord.com/api/webhooks/1306897325678923816/uIkmBEq4CNJWxNIZ3mzrVjswV4Hn8E90QA_-7iQvQ1GxuWXZmtquU6FeHzFsQdJ5fJ1R"
        }
        failure {
            echo 'Pipeline gagal. Periksa log untuk detail kesalahan.'
        }
        always {
            echo 'Pipeline selesai menjalankan semua tahap.'
        }
    }

//https://www.jenkins.io/doc/pipeline/steps/workflow-basic-steps/#pwd-determine-current-directory
}

