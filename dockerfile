FROM nginx
COPY target/ /usr/share/nginx/html
EXPOSE 80
