#!/usr/bin/env bash

set -Eeuo pipefail

BASE_DIR=$(dirname "${BASH_SOURCE[0]:-$0}")

# shellcheck source=./colors.sh
. "${BASE_DIR}/colors.sh"

VERSION=0.2.5

function help_title_section() {
  local TITLE=$(echo "$@" | tr [a-z] [A-Z])
  echo -e "${BOLD}${TITLE}${RESET}"
}

function display_version() {
  local program="$1"
  local version="$2"
  if not_installed figlet; then
    echo "${program} script version ${version}"
  else
    echo -n "${BLUE}${BOLD}"
    figlet "${program} script"
    echo -n "${RESET}"
    echo "version ${version}"
  fi
}
