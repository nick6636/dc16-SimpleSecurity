from flask import Flask, jsonify, send_file
import datetime
import subprocess

app = Flask(__name__)

@app.route("/")
def index():
	return send_file("templates/index.html")

@app.route("/api/sendSignal/<signal>", methods=['POST'])
def main(signal):
	subprocess.call(["./codesend", signal, "-p", "0", "-l", "183"])	
	
	return "200"

if __name__ == "__main__":
	app.run(host='0.0.0.0', port=81, debug=True)

