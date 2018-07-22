FROM python:3.7.0-alpine3.8
MAINTAINER hsiehpinghan "thank.hsiehpinghan@gmail.com"
COPY src /app
WORKDIR /app
RUN pip3 install -e .
EXPOSE 5000
ENV FLASK_APP /app/src/flaskkubernetes
CMD ["flask", "run"]
