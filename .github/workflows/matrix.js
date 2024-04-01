//
//    __                          __
//   / /____ ___ ____  ___  ___ _/ /       This file is provided to you by https://github.com/tegonal/minimalist
//  / __/ -_) _ `/ _ \/ _ \/ _ `/ /        Copyright 2023 Tegonal Genossenschaft <info@tegonal.com>
//  \__/\__/\_, /\___/_//_/\_,_/_/         It is licensed under European Union Public License v. 1.2
//         /___/                           Please report bugs and contribute back your improvements
//
//                                         Version: v0.17.0
//##################################
// adapted version of https://github.com/vlsi/github-actions-random-matrix/blob/main/examples/matrix.js
//##################################
const {MatrixBuilder} = require('./matrix_builder');
const {configureKotlinDefaults, setMatrix} = require('./matrix_commons');

const matrix = new MatrixBuilder();
configureKotlinDefaults(matrix)

setMatrix(matrix, 4);
