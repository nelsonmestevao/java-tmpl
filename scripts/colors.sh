#!/usr/bin/env bash

VERSION=0.2.5

RED=$(tput setaf 1)
ORANGE=$(tput setaf 3)
GREEN=$(tput setaf 2)
PURPLE=$(tput setaf 5)
CYAN=$(tput setaf 4)
BLUE=$(tput setaf 6)
WHITE=$(tput setaf 7)
BOLD=$(tput bold)
RESET=$(tput sgr0)

function colorize() {
  local COLOR TYPE

  case ${1:-reset} in
    black)
      COLOR=30
      ;;
    red)
      COLOR=31
      ;;
    green)
      COLOR=32
      ;;
    yellow)
      COLOR=33
      ;;
    blue)
      COLOR=34
      ;;
    magenta)
      COLOR=35
      ;;
    cyan)
      COLOR=36
      ;;
    white)
      COLOR=37
      ;;
    reset)
      COLOR=0
      ;;
  esac

  case ${2:-reset} in
    bold | bright)
      TYPE=1
      ;;
    underline)
      TYPE=4
      ;;
    inverse)
      TYPE=7
      ;;
    reset)
      TYPE=0
      ;;
  esac

  echo -en "\\033[${TYPE};${COLOR}m"
}
