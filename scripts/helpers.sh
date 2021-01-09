#!/usr/bin/env bash

set -Eeuo pipefail

BASE_DIR=$(dirname "${BASH_SOURCE[0]:-$0}")

# shellcheck source=./colors.sh
. "${BASE_DIR}/colors.sh"
# shellcheck source=./colors.sh
. "${BASE_DIR}/utils.sh"

VERSION=0.2.5

function log() {
  local LABEL="$1"
  local COLOR="$2"
  shift 2
  local MSG=("$@")
  printf "[${COLOR}${BOLD}${LABEL}${RESET}]%*s" $(($(tput cols) - ${#LABEL} - 2)) | tr ' ' '='
  for M in "${MSG[@]}"; do
    let COL=$(tput cols)-2-${#M}
    printf "%s%${COL}s${RESET}" "* $M"
  done
  printf "%*s\n" $(tput cols) | tr ' ' '='
}

function log_error() {
  log "FAIL" "$RED" "$@"
}

function log_warn() {
  log "WARN" "$ORANGE" "$@"
}

function log_success() {
  log "OK" "$GREEN" "$@"
}

function log_info() {
  local LABEL="INFO"

  if ! [ "$#" -eq 1 ]; then
    LABEL=$(echo "$1" | tr '[a-z]' '[A-Z]')
    shift 1
  fi

  log "${LABEL}" "$CYAN" "$@"
}

function load_env() {
  local ENV_FILE=${1:-.env}
  set -a
  if [ -f "$ENV_FILE" ]; then
    . "$ENV_FILE"
  else
    log_error "Couldn't locate ${ENV_FILE} file..."
  fi
  set +a
}

function not_installed() {
  [ ! -x "$(command -v "$@")" ]
}
