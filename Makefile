.PHONY: build build-skip-tests run run-infra run-app stop

build:
	gradlew clean build

build-skip-tests:
	gradlew clean build -x test

run:
	docker-compose up -d

run-infra:
	docker-compose up -d db-postgres

run-app:
	docker-compose up -d template-app

stop:
	docker-compose down