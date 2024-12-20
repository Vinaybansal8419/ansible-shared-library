groovy

// vars/config.groovy

def SLACK_CHANNEL_NAME = "build-status"
def ENVIRONMENT = "prod"
def CODE_BASE_PATH = "env/prod"
def ACTION_MESSAGE = "<channel message>"
def KEEP_APPROVAL_STAGE = true

return [
    SLACK_CHANNEL_NAME: SLACK_CHANNEL_NAME,
    ENVIRONMENT: ENVIRONMENT,
    CODE_BASE_PATH: CODE_BASE_PATH,
    ACTION_MESSAGE: ACTION_MESSAGE,
    KEEP_APPROVAL_STAGE: KEEP_APPROVAL_STAGE
]