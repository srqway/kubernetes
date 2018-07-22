from flask import Blueprint, jsonify, request, Response

bp = Blueprint('rest', __name__, url_prefix='/rest')

datas = []


@bp.route('/create', methods=['POST'])
def create():
    json = request.get_json()
    datas.append(json)
    return Response()


@bp.route('/retrieve', methods=['GET'])
def retrieve():
    return jsonify(datas)


@bp.route('/update', methods=['PUT'])
def update():
    json = request.get_json()
    datas[0] = json
    return Response()


@bp.route('/delete', methods=['DELETE'])
def delete():
    del datas[0]
    return Response()
