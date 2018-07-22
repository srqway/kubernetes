from flask import Flask

from flaskkubernetes import (
    rest
)

app = Flask(__name__)
app.register_blueprint(rest.bp)

