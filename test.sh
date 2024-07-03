#!/bin/bash

# Nutzer in Keycloak muss verifizierte E-Mail haben (Email eintragen und Haken setzen..)

KEYCLOAK_URL="http://localhost:8888/realms/test-realm/protocol/openid-connect/token"
CLIENT_ID="backend"
USERNAME="peter"
PASSWORD="1234"
API_URL="http://localhost:8080/api/benutzer"

# Request token from Keycloak
TOKEN_RESPONSE=$(curl -s \
  -d "client_id=${CLIENT_ID}" \
  -d "grant_type=password" \
  -d "username=${USERNAME}" \
  -d "password=${PASSWORD}" \
  "${KEYCLOAK_URL}")

#ACCESS_TOKEN=$(echo $TOKEN_RESPONSE | jq -r .access_token)
ACCESS_TOKEN=$(echo $TOKEN_RESPONSE | python3 -c "import sys, json; print(json.load(sys.stdin)['access_token'])")

# Check if the token was successfully retrieved
if [ -z "$ACCESS_TOKEN" ]; then
  echo "Failed to get access token"
  exit 1
fi

API_RESPONSE=$(curl -H "Authorization: Bearer ${ACCESS_TOKEN}" "${API_URL}")

echo $API_RESPONSE