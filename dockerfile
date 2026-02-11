FROM nginx:latest

RUN rm -rf /usr/share/nginx/html/*

COPY target/cucumber-report.html /usr/share/nginx/html/index.html

EXPOSE 80
