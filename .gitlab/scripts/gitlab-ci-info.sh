#!/usr/bin/env bash

echo "========================================================================="
echo "GitLab CI/CD info"
echo "Job: $CI_JOB_NAME"
echo "Stage: $CI_JOB_STAGE"
echo "-------------------------------------------------------------------------"
echo "Started on $(date)"
echo "$CI_PROJECT_TITLE"
echo "$CI_PROJECT_URL"
echo "Commit SHA: $CI_COMMIT_SHA"
echo "* $CI_COMMIT_SHORT_SHA $CI_COMMIT_TITLE"
echo "Author: $GITLAB_USER_LOGIN <$GITLAB_USER_EMAIL>"
echo "On runner: $HOSTNAME with ID: $CI_RUNNER_ID"
echo "Job info url: $CI_JOB_URL"
echo "========================================================================="

