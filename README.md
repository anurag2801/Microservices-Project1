# Project Overview

This project automates the deployment of a basic microservice developed using Spring Boot. The deployment process includes Dockerizing the application using the JIB plugin because JIB we don't need to wrtie dockerfile and automating the entire workflow using Jenkins pipelines.

## Technologies Used

- **Jenkins**: CI/CD tool used to orchestrate the deployment pipeline.
- **Spring Boot**: Java-based framework for building microservices.
- **Docker**: Containerization platform used to package the microservice application.
- **JIB Plugin**: Maven plugin for building Docker and OCI images without a Docker daemon.
- **AWS ECR**: Elastic Container Registry used to store Docker images.
- **AWS CLI**: Command-line interface for interacting with AWS services.
- **Git**: Version control system for managing source code repositories.

## Deployment Workflow

The deployment workflow is managed through Jenkins pipelines, ensuring automation and consistency in the deployment process.

## Steps Involved

1. **AWS & Docker Login**:
   - Authenticates with AWS ECR to retrieve credentials for Docker login.

2. **Docker Push**:
   - Uses Maven and the JIB plugin to build the microservice and push the Docker image to AWS ECR.

3. **Deploy**:
   - Deploys the Dockerized microservice to an EC2 instance.
   - Configures AWS credentials and Docker login on the remote instance.
   - Pulls the Docker image from AWS ECR and runs it as a Docker container.
   - Exposes the microservice on port 8080 for external access.

## Prerequisites

- Jenkins installed and configured with necessary plugins (AWS, Maven).
- AWS credentials (IAM user with necessary permissions) configured in Jenkins.
- Docker installed on the Jenkins server and remote EC2 instance.

## Usage

1. **Set Up Jenkins Pipeline**:
   - Configure Jenkins to use the Jenkinsfile provided in the repository.
   - Ensure proper credentials are configured in Jenkins for AWS.

2. **Run the Jenkins Pipeline**:
   - Trigger the pipeline manually or set up webhook for automatic builds on GitHub commits.

3. **Monitor Deployment**:
   - Monitor Jenkins pipeline logs for build status and deployment steps.

## Future Improvements

- Implement automated testing steps in the Jenkins pipeline.
- Enhance security practices for managing AWS credentials and Docker registries.
- Scale deployment using AWS ECS or Kubernetes for orchestration.

## Integration with Existing Infrastructure

In a previous project, we established the foundational AWS infrastructure using Terraform and Ansible. This infrastructure includes EC2 instances with security groups allowing traffic on port 8080 and essential software such as Docker, AWS CLI, and Docker Compose. This setup serves as the deployment environment for our Spring Boot microservices in this project https://github.com/anurag2801/DevOps-Project1 .

## Note

Try the endpoint http://<ip of the machine>:8080/check after deployment to make sure project is working or not . 
This project is still not finished .Later we gonna add actuator to check whether project is running or not . We gonna add new features step by step . 
Thank you

## Contributors

- [Anurag Mishra](https://github.com/anurag2801) - Developer
