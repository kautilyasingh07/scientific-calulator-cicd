# Scientific Calculator CI/CD Pipeline

[![Build Status](https://commendingly-acanthous-karie.ngrok-free.dev/job/calculator-ci/badge/icon)](https://commendingly-acanthous-karie.ngrok-free.dev/job/calculator-ci/)

A DevOps mini project implementing a complete CI/CD pipeline for a Java-based Scientific Calculator using Jenkins, Docker, and Ansible.

---

## CI/CD Pipeline Architecture

```
Developer
   │
   │ Push Code
   ▼
GitHub Repository
   │
   │ Webhook Trigger
   ▼
Jenkins Pipeline
   │
   ├── Checkout Source Code
   ├── Build & Test (Maven)
   ├── Build Docker Image
   ├── Push Image to DockerHub
   ├── Deploy Container (Ansible)
   ├── Verify Deployment
   └── Send Email Notification
   │
   ▼
Running Docker Container
```

---

## Technologies Used

| Tool | Purpose |
|-----|--------|
| Java | Application Development |
| Maven | Build & Dependency Management |
| Jenkins | CI/CD Automation |
| Docker | Containerization |
| DockerHub | Container Registry |
| Ansible | Deployment Automation |
| GitHub | Source Code Management |
| ngrok | Exposing Jenkins to Internet |

---

## Running the Application with Docker

```bash
docker run -it kautilyasingh/calculator-app:latest
```

Example output:

```
===== Scientific Calculator =====
1. Square Root
2. Factorial
3. Natural log
4. Power
5. Exit
```

---

## Deployment with Ansible

```bash
ansible-playbook ansible/deploy.yml -i ansible/inventory.ini
```

---

## Docker Image

```bash
docker pull kautilyasingh/calculator-app
```

DockerHub repository:

https://hub.docker.com/r/kautilyasingh/calculator-app

---

## Project Structure

```
scientific-calculator-cicd
│
├── src/
├── pom.xml
├── Dockerfile
├── Jenkinsfile
│
├── ansible/
│   ├── deploy.yml
│   └── inventory.ini
│
└── README.md
```

---

## Author

**Kautilya Singh**

DevOps Mini Project – Scientific Calculator CI/CD Pipeline